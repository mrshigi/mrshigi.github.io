const runningMan = document.getElementById("running-man");
const thermometerFill = document.getElementById("thermometer-fill");

let isRunning = false;
let animationInterval;

const toggleRunningMan = () => {
    isRunning = !isRunning;
    runningMan.src = isRunning ? "images/runningman.png" : "images/walkingman.png";
    runningMan.classList.toggle("running", isRunning); // Toggle the running class
    if (isRunning) {
        startRunningAnimation();
    } else {
        stopRunningAnimation();
    }
};

const startRunningAnimation = () => {
    animationInterval = setInterval(() => {
        // Adjust left margin for running man animation
        const marginLeft = parseFloat(getComputedStyle(runningMan).getPropertyValue('--margin-left')) || 0;
        runningMan.style.setProperty('--margin-left', `${marginLeft + 1}px`);
    }, 50); // Adjust the interval for smoother animation
};

const stopRunningAnimation = () => {
    clearInterval(animationInterval);
    runningMan.style.setProperty('--margin-left', '0'); // Reset margin when stopped
};

document.getElementById("running-man").addEventListener("click", toggleRunningMan);

const updateThermometer = () => {
    const donationAmount = parseInt(document.getElementById("txt-donation-amount").value);

    if (isNaN(donationAmount) || donationAmount < 0) {
        alert("Please enter a valid donation amount.");
        return;
    }

    const goal = 10000;
    const percentage = Math.min((donationAmount / goal) * 100, 100);

    // Adjust thermometer gradient using CSS variable
    thermometerFill.style.setProperty('--fill-percentage', `${percentage}%`);
};

window.onload = () => {
    document.getElementById("button-update-thermometer").onclick = updateThermometer;
    showExercise("exercise-2");
};