#Best First Search
#AKC

from queue import PriorityQueue

class Graph:
    def __init__(self):
        self.graph = {}
    def add_edge(self, node, neighbour, cost):
        if node not in self.graph:
            self.graph[node] = []
        self.graph[node].append((neighbour, cost))

def bfs(graph, start, end):
    queue = PriorityQueue()
    queue.put((0, start))
    visited = set()
    while not queue.empty():
        cost, node = queue.get()
        if node in visited:
            continue
        print(node, end=' ')
        if node == end:
            print("\nGoal found!!!")
            break
        visited.add(node)
        for neighbour, cost in graph.graph[node]:
            if neighbour not in visited:
                queue.put((cost, neighbour))

if __name__ == "__main__":
    graph = Graph()

    graph.add_edge('A', 'B', 3)
    graph.add_edge('A', 'C', 4)
    graph.add_edge('B', 'D', 2)
    graph.add_edge('B', 'E', 5)
    graph.add_edge('C', 'F', 6)
    graph.add_edge('D', 'G', 7)
    graph.add_edge('E', 'H', 4)
    graph.add_edge('F', 'I', 3)
    start_node = 'A'
    end_node = 'H'

    bfs(graph, start_node, end_node)