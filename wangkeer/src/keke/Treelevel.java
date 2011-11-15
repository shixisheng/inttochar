package keke;

class Treelevels{
	 void Treelevel(TreeNode tree,int n)
	{TreeNode root,b;
	int q;
	root=tree;q=n;
	if(root!=null)
	{	
	if(q==1)
		System.out.println(root.value);
	else {
	b=root.left;q--;
	if(b==null&&q>=1)
	{
		
		b=root.right;
		Treelevel(b,q);
		
	}
	else if(b!=null&&q>1){
		
		Treelevel(b,q);
		
	}
    else if(b!=null&&q==1){
		
    	System.out.println(b.value);
		
	}
	if(root.right!=null)
	{
		b=root.right;
		Treelevel(b,q);
	}
}
}
	}
	 }
