// Never - a way to specify that a function never returns

// function returning `never` must have unreachable end point
function err(message: string): never {
    throw new Error(message);
}