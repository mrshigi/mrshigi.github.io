const showImage = () => 
{
    document.getElementById('image').style.display='block';
}
const hideImage = () => 
{
    document.getElementById('image').style.display='none'
}



const moveSquare = () => 
{
    document.getElementById("emoji").classList.add("move-square");
}

const displayComment = () => 
{
    const product = document.getElementById("txt-product-name").value;
    const comment = document.getElementById("txt-comment").value;
    const rating = document.getElementById("txt-rating").value;
    const name = document.getElementById("txt-user-name").value;
    const h1 = document.createElement("H1");
    const textNode = document.createTextNode("Product");
    h1.appendChild(textNode);
    document.body.appendChild(h1);  
}

window.onload = () =>
{
    document.getElementById("button-show").onclick = showImage;
    document.getElementById("button-hide").onclick = hideImage;
    document.getElementById("button-comment").onclick = displayComment;
    document.getElementById("button-move").onclick = moveSquare;
}