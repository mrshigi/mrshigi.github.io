const toggleMenu = () => 
{
    const navItems = document.getElementById("nav-items");
    navItems.classList.toggle("hide-small");
};

const showExercise = (exerciseId) => 
{
    const exercises = document.querySelectorAll(".exercise-section");
    exercises.forEach((exercise) => 
    {
        exercise.style.display = "none";
    });

    const borders = document.querySelectorAll(".exercise-border");
    borders.forEach((border) => 
    {
        border.classList.remove("active");
    });

    const exerciseToShow = document.getElementById(exerciseId);
    exerciseToShow.style.display = "block";

    const activeBorder = document.querySelector(`#${exerciseId} .exercise-border`);
    activeBorder.classList.add("active");

    const thermometer = document.getElementById("thermometer");
    if (exerciseId === "exercise-2") 
    {
        thermometer.style.display = "block";
    } 
    else 
    {
        thermometer.style.display = "none";
    }
};

const determineOldestToYoungest = () => 
{
    const ages = [];
    for (let i = 1; i <= 3; i++) {
        const age = parseInt(document.getElementById(`txt-age-${i}`).value);

        if (isNaN(age)) {
            alert("Please enter valid age for all names.");
            return;
        }

        ages.push(age);
    }

    const sortedAges = ages.slice().sort((a, b) => b - a);
    const oldestYoungestDisplay = document.getElementById("oldest-youngest-display");
    oldestYoungestDisplay.innerText = "Oldest to Youngest: " + sortedAges.join(', ');
};

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
    document.getElementById("hamburger").onclick = toggleMenu;

    document.getElementById("nav-exercise-1").addEventListener("click", () => 
    {
        showExercise("exercise-1");
    });

    document.getElementById("nav-exercise-2").addEventListener("click", () => 
    {
        showExercise("exercise-2");
    });

    document.getElementById("button-determine-oldest").onclick = determineOldestToYoungest;
    document.getElementById("button-update-thermometer").onclick = updateThermometer;

    showExercise("exercise-1");
};