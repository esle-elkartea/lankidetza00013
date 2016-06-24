<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:include href="main.xslt"/>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle de la Máquina</fo:block>
		<xsl:for-each select="./Maquinarias">
			<fo:block space-before="6pt" space-after="6pt">
				Nombre: <xsl:value-of select="NombreMaquinariasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Matrícula: <xsl:value-of select="MatriculaMaquinariasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Fecha de Alta: <xsl:value-of select="FechaaltaMaquinariasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Fecha de Baja: <xsl:value-of select="FechabajaMaquinariasParsed"/>
			</fo:block>								
			<fo:block space-before="6pt" space-after="6pt">
				Responsable: <xsl:value-of select="ResponsableMaquinariasParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Coste: <xsl:value-of select="CosteMaquinariasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Modelo: <xsl:value-of select="ModeloMaquinariasParsed"/>
			</fo:block>			
			<fo:block space-before="6pt" space-after="6pt">
				Marca: <xsl:value-of select="MarcaMaquinariasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Tipo de Máquina: <xsl:value-of select="TipoMaquinariasParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Alquilado: <xsl:value-of select="AlquiladoMaquinariasParsed2"/>
			</fo:block>																			
		</xsl:for-each>	
	</xsl:template>
	<xsl:include href="elementosCabecera.xslt"/>
</xsl:stylesheet>
