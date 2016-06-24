<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:template match="/">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="simple" page-height="29.7cm" page-width="21cm" margin-top="1cm" margin-bottom="2cm" margin-left="2.5cm" margin-right="2.5cm">
					<fo:region-body margin-top="3cm" column-count="1"/>
					<fo:region-before extent="3cm"/>
					<fo:region-after region-name="footer-main" extent="1.5cm"/>
				</fo:simple-page-master>
			</fo:layout-master-set>
			<fo:page-sequence master-reference="simple">
				<fo:static-content flow-name="footer-main">
					<fo:block text-align="center" font-size="12px">- <fo:page-number/> -
					</fo:block>
				</fo:static-content>
				<fo:flow flow-name="xsl-region-body">
					<xsl:apply-templates select="result"/>
				</fo:flow>
			</fo:page-sequence>
		</fo:root>
	</xsl:template>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle de la Obra</fo:block>
		<xsl:for-each select="./Obras">
			<fo:block space-before="6pt" space-after="6pt">
				Referencia: <xsl:value-of select="ReferenciaObrasParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Nombre de la Obra: <xsl:value-of select="NombreObrasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Nº Contrato: <xsl:value-of select="NumerocontratoObrasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt" white-space-collapse="false">Dirección: <xsl:value-of select="CalleObrasParsed"/>		C.P.: <xsl:value-of select="CpObrasParsed"/>
Localidad: <xsl:value-of select="IdlocalidadObrasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt" white-space-collapse="false">Fecha de Alta: <xsl:value-of select="FechaaltaObrasParsed"/>
Fecha de Inicio de la Obra: <xsl:value-of select="FechacomienzoObrasParsed"/>		Fecha de Fin de Obra: <xsl:value-of select="FechafinObrasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Cliente: <xsl:value-of select="IdclienteObrasParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Jornadas Estimadas: <xsl:value-of select="JornadasObrasParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Importe de la Obra: <xsl:value-of select="ImporteObrasParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Observaciones: <xsl:value-of select="ObservacionesObrasParsed"/>
			</fo:block>																			
		</xsl:for-each>	
	</xsl:template>
</xsl:stylesheet>
