export class User {
    login;
    fName;
    repoCount;
    followerCount;
    repos;
    constructor(userRes) {
        this.login = userRes.login;
        this.fName = userRes.name;
        this.repoCount = userRes.public_repos;
        this.followerCount = userRes.followers;
    }
}
