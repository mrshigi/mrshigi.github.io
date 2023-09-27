const toggleMenu = () => {
    const navItems = document.getElementById("nav-items");
    navItems.classList.toggle("hide-small");
};

const changeMood = () => {
    const mood = document.getElementById("txt-mood").value.toLowerCase().trim();
    const root = document.querySelector(":root");

    if (mood === "angry") {
        root.style.setProperty("--back", "red");
        root.style.setProperty("--headback", "orange");
    }
};

const colorSquare = () => {
    document.getElementById("square").classList.add("rainbow");
};

const orderCoffee = () => {
    const numCoffees = parseInt(document.getElementById("txt-num").value);
    const coffeeType = document.getElementById("txt-type").value;
    const orderDiv = document.getElementById("coffee-order");
    const error = document.getElementById("error-num");
    error.classList.add("hidden");
    orderDiv.classList.add("hidden");

    if (isNaN(numCoffees)) {
        error.classList.remove("hidden");
        error.innerHTML = "* Not a valid number";
    } else if (numCoffees < 0) {
        error.classList.remove("hidden");
        error.innerHTML = "* Negative Number";
    } else if (numCoffees === 0) {
        error.classList.remove("hidden");
        error.innerHTML = "* Can't order zero coffees";
    } else if (numCoffees === 1) {
        orderDiv.innerHTML = `Ordered 1 ${coffeeType}.`;
        orderDiv.classList.remove("hidden");
    } else {
        orderDiv.innerHTML = `Ordered ${numCoffees} ${coffeeType}s.`;
        orderDiv.classList.remove("hidden");
    }
};

const showOldestToYoungest = () => {
    const names = [];
    const ages = [];

    for (let i = 1; i <= 3; i++) {
        const name = document.getElementById(`txt-name-${i}`).value.trim();
        const age = parseInt(document.getElementById(`txt-age-${i}`).value);

        if (!name || isNaN(age)) {
            alert("Please enter valid information for all names and ages.");
            return;
        }

        names.push(name);
        ages.push(age);
    }

    const sortedNames = names.slice().sort((a, b) => ages[names.indexOf(b)] - ages[names.indexOf(a)]);

    const oldestYoungestDisplay = document.getElementById("oldest-youngest-display");
    oldestYoungestDisplay.innerText = "Oldest to Youngest: " + sortedNames.join(', ');
};

const showThermometer = () => {
    const donationAmount = parseInt(document.getElementById("txt-donation-amount").value);

    if (isNaN(donationAmount) || donationAmount < 0) {
        alert("Please enter a valid donation amount.");
        return;
    }

    const thermometer = document.getElementById("thermometer");
    const percentage = Math.min((donationAmount / 1000) * 100, 100); // Assuming the goal is 1000, adjust as needed
    thermometer.style.background = `linear-gradient(to right, #ff4b2b ${percentage}%, #fff ${percentage}%)`;
};

window.onload = () => {
    document.getElementById("hamburger").onclick = toggleMenu;
    document.getElementById("button-change-mood").onclick = changeMood;
    document.getElementById("button-gradient").onclick = colorSquare;
    document.getElementById("button-show-data").onclick = orderCoffee;
    document.getElementById("button-determine-oldest").onclick = showOldestToYoungest;
    document.getElementById("button-update-thermometer").onclick = showThermometer;
};
