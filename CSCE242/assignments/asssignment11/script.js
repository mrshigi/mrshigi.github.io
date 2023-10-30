const gallery = document.getElementById("movie-gallery");

async function fetchMovies() {
    try {
        const response = await fetch("https://portiaportia.github.io/json/movies.json");
        const data = await response.json();

        data.forEach(movie => {
            const movieDiv = document.createElement("div");
            movieDiv.classList.add("movie");

            const title = document.createElement("h2");
            title.textContent = movie.title;

            const image = document.createElement("img");
            image.src = `https://portiaportia.github.io/json/images/${movie.image}`;
            image.alt = movie.title;

            movieDiv.appendChild(title);
            movieDiv.appendChild(image);
            gallery.appendChild(movieDiv);
        });
    } catch (error) {
        console.error("Error fetching and parsing JSON:", error);
    }
}

fetchMovies();
