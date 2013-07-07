#!/usr/bin/env node
var fs = require('fs');
var outfile = "primes.txt";
limit = 100;
primes = [];
input = [];
var done = false;
var i = 2;
while(!done){
	if(isPrime(i)) primes.push(i);
	i++;
	if(primes.length >= 100) done = true;	
}
function map(array,action){
	result = [];
	for(var i=0;i<array.length;i++){
		if(action(array[i])) result.push(array[i]);
	}
	return result;
}
function isPrime(n){
	if(n===1) return false;
	var isNotPrime = false;
	for(var j=2;j<=Math.floor(Math.sqrt(n));j++){
		isNotPrime = (n%j == 0);	
		if(isNotPrime) break;
	}
	return !isNotPrime;
}
fs.writeFileSync(outfile, primes.toString()+"\n");  
console.log("Script: " + __filename + "\nWrote: output to: " + outfile);
