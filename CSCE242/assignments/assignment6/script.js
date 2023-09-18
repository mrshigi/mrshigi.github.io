
const moveSquare = () => {
    document.getElementById("square").classList.add("move-square");
}

const displayName = () => {
    const firstName = document.getElementById("txt-first-name").value;
    console.log("Hello " + firstName + "!");
}

window.onload = () => {
    document.getElementById("button-move").onclick = moveSquare;
    document.getElementById("button-show-name").onclick = displayName;
}