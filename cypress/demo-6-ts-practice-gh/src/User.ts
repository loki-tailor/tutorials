import { Repo } from "./Repo";

export class User {
    login!: string;
    fName!: string;
    repoCount!: number;
    followerCount!: number;
    repos?: Repo[];

    constructor ( userRes: any ) {
        this.login = userRes.login;
        this.fName = userRes.name;
        this.repoCount = userRes.public_repos;
        this.followerCount = userRes.followers;
    }
}