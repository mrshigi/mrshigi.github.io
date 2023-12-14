const submitStock = (e) => {
    e.preventDefault();
    document.getElementById("results").classList.remove("hidden");
  
    const form = document.getElementById("form-Stock");
    const stockName = form.elements["Stock-name"].value;
    const termsChecked = form.elements["terms"].checked;
  
    console.log(stockName);
    console.log(termsChecked);
  };
  
  document.getElementById("form-Stock").onsubmit = submitStock;