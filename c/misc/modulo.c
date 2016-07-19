#include <stdio.h>

int mod(int u, int v);

int main() {

	int p = 8;
	int q = -3;

	int mod1 = mod(p,q);
	int mod2 = mod(q,p);
	int mod3 = mod(-p,-q);
	int mod4 = mod(-q,-p);

	printf("P: %i, Q: %i, Sol: %i\n", p, q, mod1);
	printf("P: %i, Q: %i, Sol: %i\n", q, p, mod2);
	printf("P: %i, Q: %i, Sol: %i\n", -p, -q, mod3);
	printf("P: %i, Q: %i, Sol: %i\n", -q, -p, mod4);
}

int mod (int p, int q) {

	return (p%q);
}