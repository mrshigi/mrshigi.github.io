
// Function to load and display stock data from JSON
function loadStockData() {
    fetch('stocks_data.json')
        .then(response => response.json())
        .then(data => {
            const stocksContainer = document.getElementById('stocks-container');
            data.stocks.forEach(stock => {
                // Create elements for each stock
                const stockDiv = document.createElement('div');
                stockDiv.className = 'stock-item';
                stockDiv.innerHTML = `
                    <h3>${stock.name} (${stock.symbol})</h3>
                    <p>Current Price: $${stock.price}</p>
                    <img src="${stock.image}" alt="${stock.name}">
                `;
                stocksContainer.appendChild(stockDiv);
            });
        })
        .catch(error => console.error('Error loading stock data:', error));
}

// Load stock data when the window loads
window.onload = loadStockData;
