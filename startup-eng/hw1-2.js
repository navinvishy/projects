#!/usr/bin/env node
var fs = require('fs');
var outfile = "primes.txt";
limit = 100;
primes = [];
for(var i=2;i<=100;i++){
	if(isPrime(i)) primes.push(i);	
}
function isPrime(n){
	var isNotPrime = false;
	for(var j=2;j<=Math.floor(Math.sqrt(n));j++){
		isNotPrime = (n%j == 0);	
		if(isNotPrime) break;
	}
	return !isNotPrime;
}
fs.writeFileSync(outfile, primes.toString()+"\n");  
console.log("Script: " + __filename + "\nWrote: output to: " + outfile);
