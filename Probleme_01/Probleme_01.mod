/*********************************************
 * OPL 12.7.0.0 Model
 * Author: Hp
 * Creation Date: 08 avril. 2022 at 11:17:51
 *********************************************/
int n = ...;
range I = 1..n;

int D[I] = ...;

tuple arc {
	int fromnode;
	int tonode;
}

setof (arc) Arcs = ...;

dvar int+ t[I];

minimize t[n];
subject to {
	forall (<i,j> in Arcs)t[i]+D[i] <= t[j];	
}