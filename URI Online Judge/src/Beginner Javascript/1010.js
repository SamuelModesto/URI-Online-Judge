var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var linha1 = lines.shift().split(' ');
var cod1 = parseInt(linha1[0]);
var qtd1 = parseInt(linha1[1]);
var valor1 = parseFloat(linha1[2]);

var linha2 = lines.shift().split(' ');
var cod2 = parseInt(linha2[0]);
var qtd2 = parseInt(linha2[1]);
var valor2 = parseFloat(linha2[2]);

var total = (qtd1 * valor1) + (qtd2 * valor2);

console.log("VALOR A PAGAR: R$ " + total.toFixed(2));