var title = document.title;
window.onblur = function() {
    setTimeout(function() {document.title = '客官请留步( •̀ ω •́ )y，';}, 800);
};

window.onfocus = function() {
    setTimeout(function() {
        document.title = '你回来啦O(∩_∩)O，';
        setTimeout(function() {
            document.title = title;
            }, 1000);
        }, 500);

}