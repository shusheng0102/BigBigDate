package cn.tedu.day16;

public class ListText2 {
	
	public static void main(String[] args) {
		ListLinked list=new ListLinked();
		list.add("a");
		list.add("f");
		list.add("g");
		list.add(0, "1");
		list.add(4, "2");
		list.add(2, "3");
		list.remove(0);
		list.remove(4);
		list.remove("a");
		//
		System.out.println(list);
	}

}


//ʵ��LinkedList
class ListLinked{
	
	//����
	//�ڵ���
	int size=0;
	//ͷ���
	Node first;
	//β�ڵ�
	Node last;
	
	//�ڵ�---�ڲ���
	class Node{
		//����
		String item;
		//��һ���ڵ�
		Node prev;
		//��һ���ڵ�
		Node next;
		//���췽�����и�ֵ
		public Node(String item,Node next,Node prev){
			this.item=item;
			this.prev=prev;
			this.next=next;
		}
	}
	
	//�±�Խ������
	public void out(int index){
		if(index<0||index>=size)
			throw new IllegalArgumentException("Index"+index);
	}
	
	//�����±��ҵ�ָ�����
	public Node getNode(int index){
		Node no=this.first;
		for(int i=0;i<index;i++){
			no=no.next;
		}
		return no;
	}
	
	//���
	public void add(String str){
		//�½��ڵ�
		Node node=new Node(str, null, null);
		
		//�ж���ͷ����ӻ���β�����
		if(size==0){
			//�½ڵ�ָ��ͷ�ڵ�
			this.first=node;
		}else{
			//�½ڵ�ָ��ԭβ�ڵ����һ���ڵ�
			this.last.next=node;
			//ԭβ�ڵ�ָ���½ڵ��ɾһ���ڵ�
			node.prev=this.last;
		}
		//�½ڵ�ָ��β�ڵ�
		this.last=node;
		//
		size++;
	}
	
	
	//����
	public void add(int index,String str){
		//�ж��±�Խ��
		if(index<0||index>size){
			throw new IllegalArgumentException("Index:"+index);
		}
		
		//�½��ڵ�
		Node node=new Node(str, null, null);
		
		//�ж����ĸ�λ�ý��в���
		if(index==0){//ͷ�ڵ�
			//�½ڵ�ָ��ԭͷ�ڵ����һ���ڵ�
			this.first.prev=node;
			//ԭͷ�ڵ�ָ���½ڵ����һ���ڵ�
			node.next=this.first;
			//�½ڵ�ָ��ͷ�ڵ�
			this.first=node;
		}else if(index==size){//β�ڵ�
			//������ӷ���
			add(str);
			size--;
		}else{//�м����
			//���ҵ�index�±��Ӧ�Ľڵ�
			Node no=getNode(index);
			//�½ڵ�ָ��no�ڵ����һ���ڵ����һ���ڵ�
			no.prev.next=node;
			//no����һ���ڵ�ָ���½ڵ����һ���ڵ�
			node.prev=no.prev;
			//�½ڵ�ָ��no��һ���ڵ�
			no.prev=node;
			//noָ���½ڵ����һ���ڵ�
			node.next=no;
			
		}
		
		size++;
		
		
		
	}
	
	//�����±����ɾ��
	public void remove(int index){
		//�±�Խ��
		out(index);
		
		//�ж�ɾ����λ��
		if(index==0){//ɾ��ͷ�ڵ�
			//ԭͷ�ڵ����һ���ڵ����һ���ڵ�Ϊnull
			this.first.next.prev=null;
			//ԭͷ�ڵ����һ���ڵ�ָ��ͷ�ڵ�
			this.first=this.first.next;
		}else if(index==size-1){//β�ڵ�
			//ԭβ�ڵ����һ���ڵ����һ���ڵ�Ϊnull
			this.last.prev.next=null;
			//ԭβ�ڵ����һ���ڵ�ָ��β�ڵ�
			this.last=this.last.prev;
		}else{//ɾ���м�Ԫ��
			//�ҵ�index�±��Ӧ�Ľڵ�
			Node no=getNode(index);
			
			//no�ڵ����һ���ڵ�ָ��no�����һ���ڵ����һ���ڵ�
			no.next.prev=no.prev;
			//no��һ���ڵ�ָ��no��һ���ڵ����һ��
			no.prev.next=no.next;
		}
		
		size--;
	}
	
	//ɾ��ָ��Ԫ��
	public void remove(String str){
		//
		int index=indexOf(str);
		//
		if(index!=-1)
			remove(index);
	}
	
	
	
	//Ԫ�ص�һ�γ��ֵ��±�
	public int indexOf(String str){
		//�����ڵ�
		Node no=this.first;
		for(int i=0;i<size;i++){
			//�ж�itemֵ��str�Ƿ����
			if(str==no.item||str!=null&&str.equals(no.item)){
				return i;
			}
			no=no.next;
		}
		
		//û�ҵ�
		return -1;
	}
	
	
	//ʣ�෽���Լ�����
	
	
	//��дtoString����
	@Override
	public String toString() {
		//
		StringBuilder sb=new StringBuilder("[");
		//����ƴ����ʵֵ
		//�����ڵ�
		Node no=this.first;
		for(int i=0;i<size;i++){
			sb.append(no.item).append(", ");
			no=no.next;
		}
		
		//ת���ַ���
		String str=sb.toString();
		
		//�ж�size�Ƿ�Ϊ0
		if(size>0)
			str=str.substring(0, str.length()-2);
		
		//����
		return str+="]";
	}
	
	
	
}














