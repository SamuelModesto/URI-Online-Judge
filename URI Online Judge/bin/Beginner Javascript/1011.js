var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var r = parseFloat(lines.shift());

var result = 4/3.0 * 3.14159 * r * r * r;

console.log("VOLUME = " + result.toFixed(3));