var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var nome = lines.shift();
var salario = parseFloat(lines.shift());
var totalVendido = parseFloat(lines.shift());
var salarioTotal = salario + totalVendido * 0.15;

console.log("TOTAL = R$ " + salarioTotal.toFixed(2));