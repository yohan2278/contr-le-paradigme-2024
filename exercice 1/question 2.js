
const nomfonction=(cb)=>{
    if (cb.length <= 4) return cb;
    const res=cb.slice (-4)
    return'#'.repeat(cb.length -4) +res;
}

console.log(nomfonction(4556364607935616))

