
function DNAStrand=(ADN)=>{
    const complementMap = { A: 'T', T: 'A', C: 'G', G: 'C' };
    return ADN.split('').map(c => complementMap[c] || '').join('');
  }
  
  console.log(DNAStrand("ATTGC"));
  console.log(DNAStrand("GTAT")); 