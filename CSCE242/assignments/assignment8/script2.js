const runningMan = document.getElementById("running-man");
const thermometerFill = document.getElementById("thermometer-fill");

let isRunning = false;
let animationInterval;

const toggleRunningMan = () => {
    isRunning = !isRunning;
    if (isRunning) {
        startRunningAnimation();
    } else {
        stopRunningAnimation();
    }
};

const startRunningAnimation = () => {
    runningMan.src = "images/runningman.png";
    animationInterval = setInterval(() => {
        // Adjust left margin for running man animation
        const marginLeft = parseFloat(getComputedStyle(runningMan).getPropertyValue('--margin-left')) || 0;
        runningMan.style.setProperty('--margin-left', `${marginLeft + 1}px`);
    }, 50); // Adjust the interval for smoother animation
};

const stopRunningAnimation = () => {
    runningMan.src = "images/walkingman.png";
    clearInterval(animationInterval);
    runningMan.style.setProperty('--margin-left', '0'); // Reset margin when stopped
};

const updateThermometer = () => {
    const donationAmount = parseInt(document.getElementById("txt-donation-amount").value);

    if (isNaN(donationAmount) || donationAmount < 0) {
        alert("Please enter a valid donation amount.");
        return;
    }

    const goal = 10000;
    const percentage = Math.min((donationAmount / goal) * 100, 100);

    // Gradually increase the fill percentage
    const currentPercentage = parseFloat(thermometerFill.style.getPropertyValue('--fill-percentage')) || 0;
    const increment = (percentage - currentPercentage) / 100; // Increment by 1% each time

    const fillUsingLoop = () => {
        if (currentPercentage < percentage) {
            const newPercentage = Math.min(currentPercentage + increment, percentage);
            thermometerFill.style.setProperty('--fill-percentage', `${newPercentage}%`);
            currentPercentage = newPercentage;
            setTimeout(fillUsingLoop, 10); // Adjust the interval for smoother fill
        }
    };

    fillUsingLoop();
};

window.onload = () => {
    document.getElementById("button-update-thermometer").onclick = updateThermometer;
    showExercise("exercise-2");
};