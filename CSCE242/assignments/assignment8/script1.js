
const toggleRunningMan = () => {
    const runningMan = document.getElementById("running-man");
    runningMan.src = runningMan.src.includes("walking") ? "running_image.png" : "walking_image.png";
};

document.getElementById("running-man").addEventListener("click", toggleRunningMan);
// Add an event listener to the running man image to start the movement
document.getElementById("running-man").addEventListener("click", moveRunningMan);

const updateThermometer = () => 
{
    const donationAmount = parseInt(document.getElementById("txt-donation-amount").value);

    if (isNaN(donationAmount) || donationAmount < 0) 
    {
        alert("Please enter a valid donation amount.");
        return;
    }

    const thermometerFill = document.getElementById("thermometer-fill");
    const goal = 10000;
    const percentage = Math.min((donationAmount / goal) * 100, 100);

    thermometerFill.style.height = percentage + '%';
    thermometerFill.style.background = 'linear-gradient(to top, red, red)';
};

window.onload = () => 
{
    document.getElementById("button-update-thermometer").onclick = updateThermometer;

    showExercise("exercise-2");
};