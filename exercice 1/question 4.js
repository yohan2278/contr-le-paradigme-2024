const Filter_List=(list)=>{
    return list.filter(item => typeof item === 'number');
}

console.log(filter_list([1, 2, 'a', 'b']));
console.log(filter_list([1, 'a', 'b', 0, 15]));
console.log(filter_list([1, 2, 'aasf', '3', '124', 123]));

