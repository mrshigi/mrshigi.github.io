class Toy {
  constructor(imageFileName, name) {
      this.imageFileName = imageFileName;
      this.name = name;
  }

  get details() {
      return `${this.name}`;
  }

  getToyItem() {
      return {
          imageFileName: this.imageFileName,
          name: this.name
      };
  }
}

const toys = [
  new Toy("toy1.png", "Godzilla toy"),
  new Toy("toy2.png", "Sword"),
  new Toy("toy3.png", "Sword of my Childhood"),
  new Toy("toy4.png", "The one ring"),
  new Toy("toy5.png", "Nerf Ball"),
  new Toy("toy6.png", "Nerf Gun")
];

function createToyElement(toy) {
  const container = document.createElement("div");
  container.classList.add("flex-container");

  const innerContainer = document.createElement("div");
  innerContainer.classList.add("container");

  const image = document.createElement("img");
  image.src = `images/toy.${toy.imageFileName}`;
  image.alt = "Toy Image";
  image.style.width = "100%";

  const middle = document.createElement("div");
  middle.classList.add("middle");

  const text = document.createElement("div");
  text.classList.add("text");
  text.innerText = toy.name;

  middle.appendChild(text);
  innerContainer.appendChild(image);
  innerContainer.appendChild(middle);
  container.appendChild(innerContainer);

  return container;
}

function displayToys() {
  const toyContainer = document.getElementById("toy-container");

  toys.forEach(toy => {
      const toyElement = createToyElement(toy);
      toyContainer.appendChild(toyElement);
  });
}

// Call the function to display the toys
displayToys();