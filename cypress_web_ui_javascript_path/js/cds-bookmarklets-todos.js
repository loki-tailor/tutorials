javascript: (function () {

    let maxBookmarks = prompt("how many bookmarks?");

    if (maxBookmarks) {

        for (i = 1; i <= maxBookmarks; i++) {
            setTimeout(function (data) {
                document.querySelector('input.new-todo').value = data;
                document.querySelector('input.new-todo').dispatchEvent(new Event('change', {
                    'bubbles': true
                }));
            }, i * 100, "todo #" + i)
        }
    }
}
)();
