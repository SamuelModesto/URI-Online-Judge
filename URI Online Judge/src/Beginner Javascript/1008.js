var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var numFuncionario = parseInt(lines.shift());
var numHorasTrab = parseInt(lines.shift());
var valorHora = parseFloat(lines.shift());
var salario = (numHorasTrab * valorHora);

console.log("NUMBER = " + numFuncionario);
console.log("SALARY = U$ " + salario.toFixed(2));

