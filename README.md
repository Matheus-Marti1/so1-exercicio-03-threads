# Sistemas Operacionais I - Exercício 3 - Threads

Exercício de Threads para a matéria de Sistemas Operacionais I do curso de Análise e Desenvolvimento de Sistemas da FATEC Zona Leste

## Enunciado

Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um
valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve
percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o
tempo para percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer
o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No
final, ambas as possibilidades devem apresentar o tempo em segundos.
A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a
100. 
Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra,
passar o número 2 e o mesmo vetor.

## Utilização

Clone o repositório na sua máquina local, ou baixe o Zip (clicando em Code -> Download ZIP) e extraia a pasta. Importe o projeto na IDE Eclipse (File -> Open Projects from File System... -> Escolha a pasta do projeto), e execute o programa (Shift + F11 para execução normal, e F11 para debug).
