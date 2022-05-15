## Prova A2 - Estrutura de dados - Árvore Binária
- Escreva um programa que permita implementar uma árvore binária com alocação dinamica de memória.

- A árvore retrata o organograma de uma empresa sendo que:
Em cada nodo da arvore havera 4 campos:
Um para armazenar o código de um setor
Um para armazenar a quantidade de funcionários locados no setor
Dois para armazenarem o endereço de memória dos nodos filhos

- Inicialmente um usuario vai entrar com as informaçoes para criação da árvore
e em seguida o programa deve mostrar o seguinte menu:

1. Achar setor
2. Achar quantidade
3. Média
4. Achar maior
5. Achar menor
6. Mostrar tudo in-ordem
7. Mostrar tudo pré-ordem
8. Mostrar tudo pós-ordem
9. Vazar

## Instruções

- Se a opção 1 for selecionada, o programa pede o código de um setor, varre a árvore em pre ordem com prefrência
a esquerda, e diz se o setor existe.

- Se a opção 2 for selecionada, o programa pede o código de um setor, varre a árvore em pre ordem com prefêrencia a 
direita, e diz quantos funcionários estao lotados nesse setor

- Se a opção 3 for selecionada, o programa varre a árvore em pós ordem com preferência a esquerda, calcula e mostra a 
quantidade de média de funcionários por setor na empresa.

- Se a opção 4 for selecionada, o programa varre a árvore em pós ordem com preferência a direita, e informa o código do 
setor que tem mais funcionários.

- Se a opção 5 for selecionada, o programa varre a árvore em pós ordem com preferência a direita, e informa o código do 
setor que tem menos funcionários.

- Se a opção 6 for selecionada, o programa varre a árvore in-ordem com preferência a esquerda, e informa o código do 
setor com menos funcionários.

- Se a opção 7 for selecionada, o programa varre a árvore em pré ordem com preferencia a esquerda, mostrando o código de 
todos os setores.

- Se a opção 8 for selecionada, o programa varre a árvore em pós ordem com preferência a esquerda, e mostra todos os
setores.

- Se a opção 9 for selecionada, o usuário vaza.