
let user1 = prompt("Please enter numbers separated by commas :");
let num = user1.split(',').map(Number);
num.sort(function(a, b) {
  return b - a;
});
console.log(num);
alert("Sorted numbers in descending order: " + num.join(', '));
