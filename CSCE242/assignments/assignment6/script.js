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
    const rating = document.getElementById("rating").value;
    const name = document.getElementById("txt-user-name").value;
    const userCommentSection = document.createElement("section");
    userCommentSection.classList.add("user-comment-section");
    userCommentSection.innerHTML = `
    <table>
        <tr>
            <td><h3>${product}</h3></td>
        </tr>
        <tr>
            <td>${rating}/5 stars, ${comment}</td>
        </tr>
        <tr>
            <td>By ${name}</td>
        </tr>
    </table>
`;
    document.getElementById("comment").appendChild(userCommentSection);
};

window.onload = () =>
{
    document.getElementById("button-show").onclick = showImage;
    document.getElementById("button-hide").onclick = hideImage;
    document.getElementById("button-comment").onclick = displayComment;
    document.getElementById("button-move").onclick = moveSquare;
}