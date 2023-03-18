package JavaApplicationn;
import java.util.Scanner;
public class DSLK_DOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Lc;
		Node node ;
		int temp, k;
		lien_ket_doi  lk = new lien_ket_doi() ;
		do {
			Lc = luachon(sc);
			switch (Lc) {
			case 0 :
				break;
			case 1:
				System.out.println(" Nhap vao so luong Node :");
				int slData = sc.nextInt();
				for(int i=0 ; i<slData;i++ )	{
					System.out.println("- Nhap vao Data :");
					temp = sc.nextInt();
					lk.Add(temp);
					
				}
				break;
			case 2:
				lk.Print();
				break;
			case 3:
				System.out.println("Nhap Data khoa k can tim :");
				temp = sc.nextInt();
				node = lk.Find(temp);
				if (node == null ) {
					System.out.println("Khong tim thay Node co chua khoa " + temp);
				}else {
					System.out.println(" Tim thay Node co chua khoa" + node.Data);
				}
				break;
			case 4:
				System.out.println("Nhap khoa k can tim");
				temp = sc.nextInt();
				node = lk.Find(temp);
				if (node == null) {
					System.out.println("Khong tim thay Node co chua khoa " + temp);
				}else {
					System.out.println(" Gia tri can thay the khoa" + node.Data +" : ");
					temp = sc.nextInt();
	                 node.Data = temp;
				}
				break;
			case 5:
				System.out.println(" Them vao dau danh sach");
				System.out.print("Nhap vao Data : ");
				temp = sc.nextInt();
				lk.AddFirst(temp);
				break;
			case 6:
				 System.out.println("Them vao node truoc khoa k");
	             System.out.print("Nhap vao khoa k = ");
	             k = sc.nextInt();
	             System.out.print("Nhap vao Data : ");
	             temp = sc.nextInt();
	             lk.AddFirstk(k, temp);
	             break;
			case 7:
				 System.out.println("Them node vao sau k");
	             System.out.print("Nhap vao khoa  k = ");
	             k = sc.nextInt();
	             System.out.print("Nhap vao Data : ");
	             temp = sc.nextInt();
	             lk.AddAfterk(k, temp);
	             break;
			case 8:
				System.out.println(" Xoa Phan tu khoa k");
				System.out.print("Nhap vao khoa k");
				k = sc.nextInt();
				node = new Node(k);
				lk.Deletek(node);
				break;
			case 9:
				System.out.println(" Xoa phan tu dau");
				lk.DeleteFirst();
				break;
			case 10:
				System.out.println(" Xoa phan tu truoc phan tu co khoa k");
				System.out.print("Nhap phan tu K :");
				k = sc.nextInt();
				node  = new Node(k);
				lk.DeleteFirstk(node);
				break;
			case 11:
				System.out.println(" Xoa phan tu sau phan tu co khoa k");
				System.out.print("Nhap phan tu K :");
				k = sc.nextInt();
				node  = new Node(k);
				lk.DeleteAfterk(node);
				break;
			case 12:
				 System.out.println("Xoa phan tu cuoi danh sach.");
	             lk.DeleteAfter();
	             break;
			}
			
		}while(Lc != 0);
	}
	 public static int luachon(Scanner scanner) {
	     System.out.println("--- Danh sach chua nang --- \n");
	     System.out.println("1 : Them danh sach lien ket \n");
	     System.out.println("2 : In danh sach lien ket \n");
	     System.out.println("3 : Timf kiem k trong danh sach lien ket \n");
	     System.out.println("4 : Them danh sach lien ket \n");
	     System.out.println("5 : Them Node vao dau danh sach lien ket \n");
	     System.out.println("6 : Them Node vao truoc khoa k trong danh sach lien ket \n");
	     System.out.println("7 : Them Node vao sau khoa k trong danh sach lien ket \n");
	     System.out.println("8 : Xoa phan tu co khoa k \n");
	     System.out.println("9 : Xoa phan tu dau danh sach \n");
	     System.out.println("10: Xoa phan tu truoc phan tu co khoa k \n");
	     System.out.println("11: Xoa phan tu sau phan tu co khoa k \n");
	     System.out.println("12 : Xoa phan tu cuoi danh sach \n");

	     System.out.print("Moi Nhap Lua Chon : ");
	     int lc = scanner.nextInt();
	     return lc;

}
}
