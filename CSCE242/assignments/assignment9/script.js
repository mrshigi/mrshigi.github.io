const quotes = 
[
    "Quote 1 I like dogs",
    "Quote 2 I like cats",
    "Quote 3 I like foxes",
    "Quote 4 I love tigers",
    "Quote 5 chicken sandwhich"
];
let currentQuoteIndex = 0;

function changeQuote() {
  const quoteElement = document.getElementById("quote");
  quoteElement.innerText = quotes[currentQuoteIndex];
  currentQuoteIndex = (currentQuoteIndex + 1) % quotes.length;
}

// Display the first quote initially
window.onload = changeQuote;

// Change the quote every 2 seconds
setInterval(changeQuote, 2000);

function createRainbow() {
  const rainbowElement = document.getElementById("rainbow");
  rainbowElement.innerHTML = ""; // Clear previous rainbow

  const colors = ["red", "orange", "yellow", "green", "blue", "indigo", "violet"];

  for (let i = 0; i < colors.length; i++) {
    setTimeout(() => {
      const strip = document.createElement("div");
      strip.classList.add("rainbow-strip");
      strip.style.backgroundColor = colors[i];
      rainbowElement.appendChild(strip);
    }, i * 1000);
  }

  // Show the pot of gold after the rainbow is created
  const potOfGoldElement = document.getElementById("potOfGold");
  setTimeout(() => {
    potOfGoldElement.style.display = "block";
  }, colors.length * 1000);
}