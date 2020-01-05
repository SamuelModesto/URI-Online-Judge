var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const n = 3.14159;
var R = parseFloat(lines.shift());
var A = n * (R * R);

console.log('A=' + A.toFixed(4));