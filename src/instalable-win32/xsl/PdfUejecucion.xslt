<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle de la Unidad de Ejecuci�n</fo:block>
		<xsl:for-each select="./Uejecuciones">
			<fo:block space-before="6pt" space-after="6pt">
				Referencia: <xsl:value-of select="ReferenciaUejecucionesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Obra: <xsl:value-of select="IdobraUejecucionesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Subcap�tulo: <xsl:value-of select="IdsubcapituloUejecucionesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Fecha de Comienzo: <xsl:value-of select="FechacomienzoUejecucionesParsed"/>
			</fo:block>				
			<fo:block space-before="6pt" space-after="6pt">
				Fecha de Finalizaci�n: <xsl:value-of select="FechafinUejecucionesParsed"/>
			</fo:block>						
			<fo:block space-before="6pt" space-after="6pt">
				Horas Estimadas: <xsl:value-of select="HorasestimadasUejecucionesParsed"/>
			</fo:block>							
			<fo:block space-before="6pt" space-after="6pt">
				Descripci�n: <xsl:value-of select="DescripcionUejecucionesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Observaciones: <xsl:value-of select="ObservacionesUejecucionesParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Importe: <xsl:value-of select="ImporteUejecucionesParsed"/>
			</fo:block>																			
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
