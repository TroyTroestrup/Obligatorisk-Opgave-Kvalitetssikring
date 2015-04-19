package romertal;

public class Romertalsaddition {
	private String romertal1, romertal2;

	public Romertalsaddition(String romertal1, String romertal2) {
		this.romertal1 = romertal1;
		this.romertal2 = romertal2;
	}

	public StringBuffer add() {
		StringBuffer sb = new StringBuffer();
		int overflowCounterC = 0;
		
		for ( int i=0; i<romertal1.length(); i++ ) {
			if ( romertal1.charAt( i ) == 'M' )
				sb.append( romertal1.charAt( i ) );
			if ( romertal2.charAt( i ) == 'M' )
				sb.append( romertal2.charAt( i ) );
		}
		
		for ( int i=0; i<romertal1.length(); i++ ) {
			if ( romertal1.charAt( i ) == 'D' )
				sb.append( romertal1.charAt( i ) );
			if ( romertal2.charAt( i ) == 'D' )
				sb.append( romertal2.charAt( i ) );
		}
		
		for ( int i=0; i<romertal1.length(); i++ ) {
			if ( romertal1.charAt( i ) == 'C' )
				sb.append( romertal1.charAt( i ) );
				for ( int j=0; j<sb.length(); j++ ) {
					if ( sb.charAt( j ) == 'C' )
						overflowCounterC++;
					if ( overflowCounterC > 4 )
						sb.insert(j-4, 'D');
				}
					
			if ( romertal2.charAt( i ) == 'C' )
				sb.append( romertal2.charAt( i ) );
		}
		
		for ( int i=0; i<romertal1.length(); i++ ) {
			if ( romertal1.charAt( i ) == 'L' )
				sb.append( romertal1.charAt( i ) );
			if ( romertal2.charAt( i ) == 'L' )
				sb.append( romertal2.charAt( i ) );
		}
		
		for ( int i=0; i<romertal1.length(); i++ ) {
			if ( romertal1.charAt( i ) == 'X' )
				sb.append( romertal1.charAt( i ) );
			if ( romertal2.charAt( i ) == 'X' )
				sb.append( romertal2.charAt( i ) );
		}
		
		for ( int i=0; i<romertal1.length(); i++ ) {
			if ( romertal1.charAt( i ) == 'V' )
				sb.append( romertal1.charAt( i ) );
			if ( romertal2.charAt( i ) == 'V' )
				sb.append( romertal2.charAt( i ) );
		}
		
		for ( int i=0; i<romertal1.length(); i++ ) {
			if ( romertal1.charAt( i ) == 'I' )
				sb.append( romertal1.charAt( i ) );
			if ( romertal2.charAt( i ) == 'I' )
				sb.append( romertal2.charAt( i ) );
		}
		
		return sb;
	}

}
