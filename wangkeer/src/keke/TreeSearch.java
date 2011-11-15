package keke;

public  class  TreeSearch
{     
	 TreeSearch(){}     
     void Treesear(TreeNode tree){
    	  TreeNode root=new TreeNode(),b=new TreeNode();
    	  if(tree!=null)
    	  {
    		  root=tree;
    	  if(root.left!=null)
    	  {b=root.left;
    	  	Treesear(b);}
    	  System.out.println(tree.value);
    	 if(root.right!=null){
    		  b=root.right;
    		  Treesear(b);
      }
    	  }
}
     public static void main(String args[]){
   	  TreeNode[] treeNodess=new TreeNode[7];
   	  for(int i=0;i<7;i++)
   	  {treeNodess[i]=new TreeNode();}
   	   TreesCreat a=new TreesCreat(); 
   	   treeNodess=a.TreeCreats();
   	   TreeSearch b=new TreeSearch();
   	   b.Treesear(treeNodess[0]);
   	   //Treelevels c=new Treelevels();
   	   //c.Treelevel(treeNodess[0],3);
     } 
}