import os
needle = 'StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\\u0001">('
for root, ds, fs in os.walk('src/main/java/rs'):
    for f in fs:
        if not f.endswith('.java'):
            continue
        p = os.path.join(root, f)
        with open(p, encoding='utf8') as fh:
            s = fh.read()
        s = s.replace(needle, 'String.valueOf(')
        s = s.replace('Client.do', 'Client.npcArray')
        if p.endswith(os.path.join('rs', 'n', 'c', 'd', 'a.java')):
            s = s.replace('public static rs.n.d.c do;', 'public static rs.n.d.c resource;')
            s = s.replace('      do = a(d(32300));', '      resource = a(d(32300));')
            s = s.replace('rs.n.c.d.c.a(do);', 'rs.n.c.d.c.a(resource);')
            s = s.replace('      do.a();', '      resource.a();')
        if p.endswith(os.path.join('rs', 'Client.java')):
            s = s.replace('      do = new rs.a.k[this.kt];', '      npcArray = new rs.a.k[this.kt];')
            s = s.replace('if (do != null && var230 <= npcArray.length - 1', 'if (npcArray != null && var230 <= npcArray.length - 1')
        with open(p, 'w', encoding='utf8') as fh:
            fh.write(s)
