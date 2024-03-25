# Travelling sales man problem

import itertools

def tsp_brute_force(graph):
    all_permutations = itertools.permutations(graph.keys())
    min_cost = float('inf')
    optimal_path = None
    for path in all_permutations:
        cost = 0
        for i in range(len(path) - 1):
            cost += graph[path[i]][path[i + 1]]
        cost += graph[path[-1]][path[0]]
        if cost < min_cost:
            min_cost = cost
            optimal_path = path+(path[0],)
    return optimal_path, min_cost

if __name__ == '__main__':
    graph = {
        'A': {'B': 10, 'C': 15, 'D': 20},
        'B': {'A': 10, 'C': 35, 'D': 25},
        'C': {'A': 15, 'B': 35, 'D': 30},
        'D': {'A': 20, 'B': 25, 'C': 30}
    }

    optimal_path,min_cost=tsp_brute_force(graph)
    print("Optimal Path:",optimal_path)
    print("Minimum Cost:",min_cost)