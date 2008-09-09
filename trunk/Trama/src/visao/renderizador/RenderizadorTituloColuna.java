package visao.renderizador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;

import visao.JTableCustomizado;

public class RenderizadorTituloColuna extends DefaultTableCellRenderer {
	public RenderizadorTituloColuna() {
		super();
	}
	
	@Override
	public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
		JTableCustomizado tab = ( JTableCustomizado ) table;
		Icon icon = null;
		JLabel label = new JLabel();
		label.setOpaque( true );
		label.setHorizontalAlignment( CENTER );
		label.setVerticalAlignment( JLabel.BOTTOM );
		label.setFont( getFont().deriveFont( 12f ) );
		label.setBorder( new SoftBevelBorder( BevelBorder.RAISED ) );
		label.setForeground( new Color( 0, 0, 0 ) );
	// System.out.println( row + " ---- " + column + "   " + hasFocus );
	 
		
		if( !value.toString().startsWith( "|||" ) ){
			if( tab.getColunaAtual() == column && tab.getLinhaAtual() >= 0 ) label.setBorder( new SoftBevelBorder( BevelBorder.LOWERED ) );
			label.setBackground( UIManager.getDefaults().getColor( "Button.light" ) );
		} else{
			if( tab.getColunaAtual() == column && tab.getLinhaAtual() >= 0 ) label.setBorder( new SoftBevelBorder( BevelBorder.LOWERED ) );
			label.setBackground( new Color( 244, 103, 84 ) );
		}
		if( tab.getLinhaAtual() == -2 ) label.setBorder( new SoftBevelBorder( BevelBorder.RAISED ) );
		
		if( value.toString().length() > 30 ){
			label.setToolTipText( value.toString().replace( "|||", "" ) );
			icon = getVerticalCaption( label, value.toString().replace( "|||", "" ).substring( 0, 29 ) + "...", true );
		} else{
			
			String ss = value.toString().replace( "|||", "" );
			for( int i = 0; i < 30; i++ ){
				if( ss.length() < 30 ) ss = " " + ss;
			}
			icon = getVerticalCaption( label, ss, true );
		}
		label.setIcon( icon );
		
		if( column == 0 ) label.setBorder( new SoftBevelBorder( BevelBorder.RAISED ) );
		return label;
	}
	/**
	 * @param componente
	 * @param texto
	 * @param sentido
	 */
	private Icon getVerticalCaption( JComponent componente, String texto, boolean sentido ) {
		Font f = componente.getFont();
		FontMetrics fm = componente.getFontMetrics( f );
		int captionHeight = fm.getHeight();
		int captionWidth = fm.stringWidth( texto );
		BufferedImage bi = new BufferedImage( captionHeight + 5, captionWidth + 3, BufferedImage.TYPE_INT_ARGB );
		Graphics2D g = ( Graphics2D ) bi.getGraphics();
		
		g.setColor( new Color( 0, 0, 0, 0 ) ); // transparent
		
		g.fillRect( 0, 0, bi.getWidth(), bi.getHeight() );
		
		g.setColor( componente.getForeground() );
		g.setFont( f );
		g.setRenderingHint( RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VRGB );
		g.setRenderingHint( RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY );
		
		if( sentido ){
			g.rotate( Math.PI / 2 );
		} else{
			g.rotate( -Math.PI / 2 );
			g.translate( -bi.getHeight(), bi.getWidth() );
		}
		g.drawString( texto, 2, -6 );
		
		Icon icon = new ImageIcon( bi );
		return icon;
	}
}
