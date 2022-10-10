import _ from "lodash";
import { GitHubApiService as gh } from './GitHubApiService.js';
console.log("hello");
let svc = new gh();
if (process.argv.length < 3) {
    console.log('please pass username as argument...');
    process.exit(1);
}
const userName = process.argv[2]; // jwasham
svc.getUserInfo(userName, (user) => {
    svc.getRepos(user, (repos) => {
        const sortedRepos = _.sortBy(repos, [(repo) => repo.forkCount * -1]);
        const top5 = _.take(sortedRepos, 2);
        user.repos = top5;
        console.log(user);
    });
});
