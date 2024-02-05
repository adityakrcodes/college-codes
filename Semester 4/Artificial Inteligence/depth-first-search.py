# Depth First Search (DFS)
#AKC

graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}


def dfs(graph, node, visited):
    if node not in visited:
        visited.append(node)
        for k in graph[node]:
            dfs(graph, k, visited)
        return visited


visited = dfs(graph, "A", [])
print(visited)
