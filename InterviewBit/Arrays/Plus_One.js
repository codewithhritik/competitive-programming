function plusOne(A) {
	// If the first number is zero, remove it from the array
	let index = 0;
	while(A[index] == 0) {
		A.shift();
	}
	for(let i = A.length-1; i >= 0; i--) {
		if(A[i] != 9) {
                	A[i]++;
                	return A;
            	} else {
                	A[i] = 0;
            	}
        }
        // If the digit is 999, we'll have to add 1 in front of the array
	A.unshift(1);
        return A;
}