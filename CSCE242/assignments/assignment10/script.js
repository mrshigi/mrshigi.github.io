class Toy {
    constructor(imageFileName, name, description, price) {
      this.name = name;
      this.imageFileName = imageFileName;
      this.description = description;
      this.price = price;
    }

    getDetails() {
      return `${this.name}: ${this.description} - $${this.price}`;
    }

    getToyItem() {
      return {
        name: this.name,
        imageFileName: this.imageFileName,
        description: this.description,
        price: this.price,
      };
    }
  }

  const toys = [
    new Toy("toy1.png", "Godzilla toy", "Age - 3-5", 17.99),
    new Toy("toy2.png", "Sword", "Age - 6-75", 1699.99),
    new Toy("toy3.png", "Sword of my Childhood", "Age - 3-8", 0),
    new Toy("toy4.png", "The One Ring", "The One True Ring, a Soul must be given", 1000000000000),
    new Toy("toy5.png", "Nerf Ball", "Age - 3-21", 4.20),
    new Toy("toy6.png", "Nerf Gun", "Age - 6-8", 4.20),
  ];

  function createToyElement(toy) {
    const container = document.createElement("div");
    container.classList.add("flex-container");

    const innerContainer = document.createElement("div");
    innerContainer.classList.add("container");

    const image = document.createElement("img");
    image.src = `images/${toy.imageFileName}`;
    image.alt = "Toy Image";
    image.style.width = "200px";

    const tooltip = document.createElement("div");
    tooltip.classList.add("tooltip");
    tooltip.innerText = 
    `${toy.name}
    ${toy.description}
    $${toy.price}`;

    image.addEventListener("mouseover", () => {
      tooltip.style.visibility = "visible";
    });

    innerContainer.appendChild(image);
    innerContainer.appendChild(tooltip);
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

  displayToys();