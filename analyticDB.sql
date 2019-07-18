create database analyticBD
Go
USE analyticBD
GO
CREATE TABLE [dbo].[site](
	[numVisitasMensais] [int] NOT NULL,
	[comprasMensais] [int] NOT NULL,
	[mes] [varchar](30) NOT NULL,
	[ano] [varcahr](30) NOT NULL, 
	[qtdAssinantesMes] [int]NOT NULL,
	[mesAssinatura] [date] NOT NULL,
	[anoAssinatura] [date] NOT NULL,
)
GO
CREATE TABLE [dbo].[teclados](
	[qtdTecladosProduzidosMes] [int] NOT NULL,
	[tecladosProduzidosPorUsuariosPremium] [int] NOT NULL,
	--Pra obter a quantidade de teclados feitos por n premium é só 
	--fazer o 1º atr - o 2º atr
	
)