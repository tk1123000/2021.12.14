package Ex03;

public class DollMmain {

	public static void main(String[] args) {
      Muchine ma = new Muchine();
      Pika pika = new Pika();
      Piri piri= new Piri();
      Kkobuk kkobuk= new Kkobuk();
      //머신을 통해서 피카츄 인형을 뽑고싶어요
//      ma.getPika(pika);
//      ma.getPiri(piri);
//      ma.getKkobuk(kkobuk);
//    		  
      ma.getDoll(pika);
      ma.getDoll(piri);
      ma.getDoll(kkobuk);
      
	}

}
