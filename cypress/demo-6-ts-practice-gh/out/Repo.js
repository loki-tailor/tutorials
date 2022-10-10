export class Repo {
    name;
    desc;
    url;
    size;
    forkCount;
    constructor(r) {
        this.name = r.name;
        this.desc = r.description;
        this.url = r.html_url;
        this.size = r.size;
        this.forkCount = r.forks_count;
    }
}
