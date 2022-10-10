export class Repo {
    name!: string;
    desc!: string;
    url!: string;
    size!: number;
    forkCount!: number;

    constructor ( r: any ) {
        this.name = r.name;
        this.desc = r.description;
        this.url = r.html_url;
        this.size = r.size;
        this.forkCount = r.forks_count;
    }

}