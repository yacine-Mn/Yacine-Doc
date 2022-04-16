/*********************************************
 * OPL 12.7.0.0 Model
 * Author: asus
 * Creation Date: 17 avril. 2022 at 01:02:51
 *********************************************/
int a = ...;
range I = 1..a;

int r[I] = ...;

tuple ar {
	int mode;
	int todo;
}

setof (ar) Ass = ...;

dvar int+ t[I];

minimize t[a];
subject to {
	forall (<i,j> in Ass)t[i]+r[i] <= t[j];	
}