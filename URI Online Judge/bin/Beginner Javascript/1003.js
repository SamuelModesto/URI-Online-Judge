var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num1 = parseInt(lines.shift());
var num2 = parseInt(lines.shift());

console.log("SOMA = "+ (num1 + num2));