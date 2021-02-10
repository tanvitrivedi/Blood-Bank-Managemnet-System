function Wikipedia(){
document.location.href="https://en.wikipedia.org/wiki/Reine";
}

var modal = document.getElementById('id01');
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}